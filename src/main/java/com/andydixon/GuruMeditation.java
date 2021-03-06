package com.andydixon;

public class GuruMeditation {

    static String generate(String meditation) {
        if (meditation.equals("")) meditation="00000025.65045330";
        return
                "<!DOCTYPE html>\n" +
                "<html lang=\"en_GB\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>Error</title>\n" +
                "  <style type=\"text/css\">\n" +
                "    body {\n" +
                "      margin: 0;\n" +
                "      background-color: #000;\n" +
                "    }\n" +
                "\n" +
                "    #guru {\n" +
                "      top: 0;\n" +
                "      left: 0;\n" +
                "      width: 97%;\n" +
                "      padding: 4px;\n" +
                "      padding-bottom: 4px;\n" +
                "      border: solid 8px #f72800;\n" +
                "      margin-bottom: 1em;\n" +
                "      background-color: #000000;\n" +
                "      color: #f72000;\n" +
                "      text-align: center;\n" +
                "      font-size: large;\n" +
                "    }\n" +
                "\n" +
                "    .center {\n" +
                "      text-align: center;\n" +
                "    }\n" +
                "  </style>\n" +
                "  \n" +
                "</head>\n" +
                "<body>\n" +
                "  <div id=\"guru\">\n" +
                "    Software Failure.&nbsp;&nbsp;&nbsp;Press left mouse button to continue.<br><br>\n" +
                "    Guru meditation #"+meditation+"\n" +
                "  </div>\n" +
                "</body>\n" +
                "<script>\n" +
                "    var color=true;\n" +
                "      if (document.getElementById) {\n" +
                "        obj=document.getElementById('guru');\n" +
                "        obj.style.display=\"block\";\n" +
                "        obj.style.cursor=\"wait\";\n" +
                "        setInterval(blinkGuru, 1000);\n" +
                "      } else {\n" +
                "        alert('Browser not compatible.');\n" +
                "      }\n" +
                "    function blinkGuru() {\n" +
                "      obj=document.getElementById('guru');\n" +
                "      if (color) {\n" +
                "        obj.style.borderColor='#000000';\n" +
                "        color=false;\n" +
                "      } else {\n" +
                "        obj.style.borderColor='#f72000';\n" +
                "        color=true;\n" +
                "      }\n" +
                "      return;\n" +
                "    }\n" +
                "  </script>\n" +
                "</html>\n" +
                "\n";
    }

}
