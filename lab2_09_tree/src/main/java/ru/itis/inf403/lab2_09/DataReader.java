package ru.itis.inf403.lab2_09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        List<RawRow> rawRows = dataReader.readFile("med.csv");
        dataReader.clearData(rawRows);

    }

    public List<RawRow> readFile(String fileName) {
        List<RawRow> result = new ArrayList<>();
        File file = new File(fileName);
        if (!file.exists() || !file.isFile()) return result;
        try (
//            InputStream is = new FileInputStream(file);
//            Reader reader = new InputStreamReader(is);
//            BufferedReader br = new BufferedReader(reader)
            BufferedReader br = new BufferedReader(new FileReader(file))

        ) {
            br.readLine();

            while (br.ready()) {
                String[] data = br.readLine().split(";");
                if (data.length < 24) continue;
                RawRow raw = new RawRow();
                raw.setRiskScoreCVRM(data[6]);
                raw.setMdrd(data[7]);
                raw.setGlucoseFasting(data[9]);
                raw.setTotalCholesterol(data[11]);
                raw.setSystolicBloodPressure(data[13]);
                raw.setDiastolicBloodPressure(data[14]);
                raw.setBmi(data[16]);
                raw.setPsCVRM(data[18]);
                raw.setSmokingStatus(data[19]);
                raw.setAge(data[22]);
                raw.setHypertension(data[23]);
                result.add(raw);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public List<Row> clearData(List<RawRow> raw) {
        return raw.stream()
                .filter(r -> !r.badRecord())
                .map(r -> convertor(r)).toList();
    }

    public Row convertor(RawRow raw) {
        Row r = new Row();
        r.setRiskScoreCVRM(Integer.parseInt(raw.getRiskScoreCVRM()));
        r.setMdrd(Integer.parseInt(raw.getMdrd()));

        return r;
    }


    public void tree() {
        Node root = new Node();

        Node[] tree = new Node[63];

/*
        for (int i = 0; i < tree.length; ++i ) {
            tree[i].setFunction(
              r -> tree.
            );
        }
*/


    }
}
