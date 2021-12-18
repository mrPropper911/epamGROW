package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	/*Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий
	 последовательно возвращать содержимое узлов xml-документа и его тип (открывающийтег, закрывающий тег,
	 содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.*/

        String xml = "<notes>" +
                "\n <note id = \"1\">" +
                "\n  <to>Вася</to>" +
                "\n  <from>Света</from>" +
                "\n  <heading>Напоминание</heading>" +
                "\n  <body>Позвони мне завтра!</body>" +
                "\n </note>" +
                "\n <note id = \"2\">" +
                "\n  <to>Петя</to>" +
                "\n  <from>Маша</from>" +
                "\n  <heading>Важное напоминание</heading>" +
                "\n  </body>" +
                "\n </note>" +
                "\n</notes>";

        String searchSentences = " ";//todo
        Pattern patternForSearchSentences = Pattern.compile(searchSentences);
        Matcher matcher = patternForSearchSentences.matcher(xml);
        while (matcher.find()){
            System.out.println(matcher.group());
        }


    }
}
