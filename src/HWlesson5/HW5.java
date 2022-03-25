package HWlesson5;

import java.io.*;

public class HW5 {
    public static void main(String[] args){

        int[][] array = {{100,200,123},{300,400,456},{600,700,901}};
        AppData data1 = new AppData(2,"Value 1,Value 2,Value 3",array);
        File.saveToFile(data1);

        AppData data2 = File.loadFromFile(File.file);

    }

    public static class File {

        final static String file = "file.csv";

        public static void saveToFile(AppData data) {

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(data.getDump());
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        public static AppData loadFromFile(String file) {

            String dump = "";
            String line;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                while ((line = reader.readLine()) != null) {
                    dump += line + '\n';
                }
            } catch (Exception e) {
                System.err.println(e);
            }
            AppData data = new AppData(dump);
            return data;
        }
    }


    @FunctionalInterface
    interface ConverterToInt {
        int[] convert(String[] array);
    }

    @FunctionalInterface
    interface ConverterToStr {
        String[] convert(int[] array);
    }


    static class AppData {
        private String[] headers;
        private int[][] data;
        final String SEPARATOR = ";";

        public AppData(int size, String headerLine, int[][] data) {
            this.headers = headerLine.split(",");
            this.data = data;
        }

        public AppData(String dump) {
            String[] data = dump.split("\n");
            this.headers = new String[data[0].split(SEPARATOR).length];
            this.data = new int[data.length - 1][this.headers.length];
            this.setDump(dump);
        }

        public void setDump(String dump) {

            ConverterToInt converter = (array) -> {
                int[] res = new int[(array.length)];
                for (int j = 0; j < array.length; j++) {
                    res[j]=Integer.valueOf(array[j]);
                }
                return res;
            };

            try {
                String[] data = dump.split("\n");
                this.headers = data[0].split(";");
                for (int i = 1; i < data.length; i++) {
                    this.data[i-1]=converter.convert(data[i].split(SEPARATOR));
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }

        public String getDump(){

            ConverterToStr converter = (array) -> {
                String[] res = new String[array.length];
                for (int j = 0; j < array.length; j++) {
                    res[j]=Integer.toString(array[j]);
                }
                return res;
            };

            String[] dumpArr = new String[(this.data.length+1)];
            dumpArr[0] = String.join(SEPARATOR, this.headers);
            for (int i = 0; i < this.data.length; i++) {
                dumpArr[i+1] = String.join(SEPARATOR, converter.convert(this.data[i]));
            }
            String res = "";
            for (String s : dumpArr) {
                res+=s+'\n';
            }
            return res;
        }

    }

}
