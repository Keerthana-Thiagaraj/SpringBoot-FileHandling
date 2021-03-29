package com.healint.FileHandling.helper;

import com.healint.FileHandling.model.StoreModel;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVHelper {

    public static String TYPE = "text/csv";
    static String[] HEADER = {"ID", "Order ID", "Order Date", "Ship Date", "Ship Mode", "Customer ID", "Customer Name", "Segment",
            "Country", "City", "State", "Postal Code", "Region", "Product ID", "Category", "Sub-Category", "Product Name",
            "Sales", "Quantity", "Discount", "Profit"};

    public static boolean hasCSVFormat(MultipartFile file) {

        if (!TYPE.equals(file.getContentType())) {
            return false;
        }

        return true;
    }

    public static List<StoreModel> csvToStoreRecords(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

            List<StoreModel> storeModels = new ArrayList<StoreModel>();

            Iterable<CSVRecord> csvRecords = csvParser.getRecords();

            for (CSVRecord csvRecord : csvRecords) {
                StoreModel storeModel = new StoreModel(
                        Long.parseLong(csvRecord.get("ID")),
                        csvRecord.get("Order ID"),
                        csvRecord.get("Order Date"),
                        csvRecord.get("Ship Date"),
                        csvRecord.get("Ship Mode"),
                        csvRecord.get("Customer ID"),
                        csvRecord.get("Customer Name"),
                        csvRecord.get("Segment"),
                        csvRecord.get("Country"),
                        csvRecord.get("City"),
                        csvRecord.get("State"),
                        csvRecord.get("Postal Code"),
                        csvRecord.get("Region"),
                        csvRecord.get("Product ID"),
                        csvRecord.get("Category"),
                        csvRecord.get("Sub-Category"),
                        csvRecord.get("Product Name"),
                        csvRecord.get("Sales"),
                        csvRecord.get("Quantity"),
                        csvRecord.get("Discount"),
                        csvRecord.get("Profit")
                );

                storeModels.add(storeModel);
            }

            return storeModels;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}
