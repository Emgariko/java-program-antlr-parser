package parser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main( String[] args) throws Exception
    {
        JavaProgramLexer expressionLexer = new JavaProgramLexer(CharStreams.fromFileName("src/main/java/parser/sample.txt"));
        CommonTokenStream commonTokenStream = new CommonTokenStream(expressionLexer);
        JavaProgramParser expressionParser = new JavaProgramParser(commonTokenStream);
        JavaProgramParser.ProgramContext context = expressionParser.program();
        String html = String.format(
                "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "    <meta charset=\"UTF-8\">\n" +
                        "    <title>Title</title>\n" +
                        "    %s\n" +
                        "    \n" +
                        "</head>\n" +
                        "<body>\n" +
                        "\n" +
                        "</body>\n" +
                        "</html>",
                context.str
        );
        System.out.println(context.str);
        Path path = Paths.get("src/main/resources/index.html");
        Files.write(path, html.getBytes());
        String test = "&nbsp;";
    }
}
