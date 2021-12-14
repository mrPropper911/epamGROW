package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void sortMapMinMax (Map<String, Integer> map, LinkedHashMap<String, Integer> sortedMap){
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
    }

    public static void sortMapMaxMin (Map<String, Integer> map, LinkedHashMap<String, Integer> sortedMap){
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
    }

    //1 - Sort paragraphs by number of sentences
    public static void sortParagraphs(String strIn){
        Map<String, Integer> map = new HashMap<>();
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        String[] paragraghsArray = strIn.split("\\n");
        String searchSentences = "([.!?])([\\s])([A-Z]*)";
        Pattern patternForSearchSentences = Pattern.compile(searchSentences);

        //counting
        int count = 0;
        for (int i = 0; i < paragraghsArray.length; i++){
            Matcher matcher = patternForSearchSentences.matcher(paragraghsArray[i]);
            while (matcher.find()){
                count++;
            }
            count++; //for last sentences
            map.put(paragraghsArray[i],count);
            count = 0;
        }

        sortMapMinMax(map, sortedMap);
        for (String index : sortedMap.keySet()) {
            System.out.print(index + "\n");
        }
    }

    //2 - Sort words by length in each sentence
    public static void sortByLengthWord (String strIn){
        String[] paragraghsArray = strIn.split("\\n");
        for (int i = 0; i < paragraghsArray.length; i++){
            Map<String, Integer> map = new HashMap<>();
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            String[] sentencesArray = paragraghsArray[i].split("\\s");
            for (int j = 0; j < sentencesArray.length; j++){
                map.put(sentencesArray[j],sentencesArray[j].length());
            }
            sortMapMinMax(map, sortedMap);
            for (String index : sortedMap.keySet()) {
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }

    //3 - Sort in descending order by the number of occurrences of a given character
    public static void sortBySymbol (String strIn, char charIn){
        String[] paragraghsArray = strIn.split("\\n");
        for (int i = 0; i < paragraghsArray.length; i++){
            Map<String, Integer> map = new HashMap<>();
            LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
            String[] sentencesArray = paragraghsArray[i].split("\\s");
            for (int j = 0; j < sentencesArray.length; j++){
                int count = 0;
                for (char element: sentencesArray[j].toCharArray()){
                    if (element == charIn)
                        count++;
                }
                map.put(sentencesArray[j],count);
                count = 0;
            }
            sortMapMaxMin(map, sortedMap);

            //In case of equality - alphabetically
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (Integer index : sortedMap.values()){
                if (!arrayList.contains(index))
                    arrayList.add(index);
            }

            for (Integer index : arrayList){
                ArrayList<String> arrayList2 = new ArrayList<>();
                for (HashMap.Entry<String, Integer> e : map.entrySet()){
                    if (index == e.getValue()){
                        arrayList2.add(e.getKey());
                    }
                }
                Collections.sort(arrayList2);
                for (String index2 : arrayList2){
                    System.out.print(index2 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
	/*1.Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом
	 три различных операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать
	 слова по длине; отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
	 а в случае равенства – по алфавиту.*/

    String strIn = "Here you can find activities to practise your reading skills?\n" +
            "Reading will help you to improve your. Understanding of the language and build your vocabulary.\n" +
            "The self-study lessons in this section are written and organised according to the levels of the " +
            "Common European Framework of Reference for languages CEFR.\n" +
            "There are different types of texts and interactive exercises. That practise the reading skills! " +
            "You need to do well in your studies, to get ahead at work and to communicate in English in your free time.";

        int switchChoise = 4;

        while (true){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Select operation: " +
                    "\n1 - Sort paragraphs by number of sentences" +
                    "\n2 - Sort words by length in each sentence" +
                    "\n3 - Sort in descending order by the number of occurrences of a given character" +
                    "\n4 - Exit");
            switchChoise = Integer.parseInt(bufferedReader.readLine());

            switch (switchChoise){
                case (1): sortParagraphs(strIn); break;
                case (2): sortByLengthWord(strIn); break;
                case (3):
                    System.out.println("Enter character for search: ");
                    char symbolForSearch = (char)bufferedReader.read();
                    sortBySymbol(strIn,symbolForSearch);
                    break;
                case (4): return;
                default:
                    System.out.println("Please enter number (1-4)");
                    break;
            }
        }
    }
}
