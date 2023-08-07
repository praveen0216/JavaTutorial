package tutorial.java.hackerrank.arrays;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class Result {

        /*
         * Complete the 'matchingStrings' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts following parameters:
         *  1. STRING_ARRAY stringList
         *  2. STRING_ARRAY queries
         */

        public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
            // Write your code here
            int count = 0;
            List<Integer> l = new ArrayList<>(queries.size());
            for(int i = 0 ; i < queries.size(); i ++) {
                for(int j =0; j < stringList.size(); j ++) {
                    if ((queries.get(i).equals(stringList.get(j)))) count ++;
                }
                l.add(count);
                count = 0;
            }
            return  l;
        }
    }

    public class SparseArray {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("sparse.txt"));
            PrintWriter printWriter = new PrintWriter("sparseOut.txt");

            int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
                        try {
                            return bufferedReader.readLine();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    })
                    .collect(toList());

            List<Integer> res = Result.matchingStrings(stringList, queries);

            printWriter.print(res.stream().map(Object::toString).collect(Collectors.joining(" ")));
            printWriter.flush();

            bufferedReader.close();
            printWriter.close();
        }
    }

