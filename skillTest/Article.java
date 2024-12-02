class Article {

    String topic = "fantasy";
    int wordCount = 100;

    public Article() {
        System.out.println("Made an Object");
    }
    public String getTopic()
    {
        return topic;
    }
    public int getWordCount()
    {
        return wordCount;
    }
}