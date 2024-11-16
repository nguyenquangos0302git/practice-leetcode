public class Main {
    public static void main(String[] args) {
        String title = "27. Remove Element";
        System.out.println(modifyTitleIntoClassName(title));
    }

    public static String modifyTitleIntoClassName(String title) {
        if (title == null || title.isEmpty()) return "";
        return "_" + title.replaceAll("\\s+|.\\s", "_");
    }

}