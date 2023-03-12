package com.newhope.bigdata.application.regex;


import java.util.regex.Pattern;

public class StringsRegexPractice {
    public static final String EXAMPLE_TEST
            = "This is my small example "
            + "string which I'm going to "
            + "use for pattern matching.";
    //public static final String EXAMPLE_TEST ="1";

    public static void main(String[] args) {
        String div = "--------------------------------------------";
        System.out.println(EXAMPLE_TEST.matches("\\w.*"));
        System.out.println(div);

        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);// should be 14
        System.out.println(div);

        for (String string : splitString) {
            System.out.println("---> " + string);
        }
        System.out.println(div);
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "|"));


        /**
         * Java 捕获组中的正则表达式用于将多个字符视为单个单元。您可以使用 （） 创建组。
         * 与捕获组匹配的输入字符串部分将保存到内存中，并可以使用反向引用调用。
         * 您可以使用 matcher.groupCount 方法来找出 java 正则表达式模式中捕获组的数量。
         * 例如，（（a）（bc）） 包含 3 个捕获组 - （（a）（bc））、（a） 和 （bc） 。
         * 您可以在  正则表达式中使用带有反斜杠 （\） 的反向引用，然后是要调用的组的编号。
         * 捕获组和反向引用可能会令人困惑，因此让我们通过一个例子来理解这一点。
         */
        // 元字符
        System.out.println(Pattern.matches("(\\w\\d)\\1", "a2a2")); //true
        System.out.println(Pattern.matches("(\\w\\d)\\1", "b2b2")); //false
        System.out.println(Pattern.matches("(AB)(B\\d)\\2\\1", "ABB2B2AB")); //true
        System.out.println(Pattern.matches("(AB)(B\\d)\\2\\1", "ABB2B3AB")); //false

        /**
         * 在第一个示例中，在运行时第一个捕获组是 (\w\d)，当与输入字符串“a2a2”匹配并保存在内存中时，它的计算结果为“a2”。 所以 \1 指的是“a2”，因此它返回 true。
         * 于同样的原因，第二条语句打印为 false。 尝试自己理解语句 3 和 4 的这种情况。 :) 现在我们将看看 Pattern 和 Matcher 类的一些重要方法。
         */

    }
}