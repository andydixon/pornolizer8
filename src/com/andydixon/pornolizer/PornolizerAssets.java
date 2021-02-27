package com.andydixon.pornolizer;

public class PornolizerAssets {

    static String homePage = "<!DOCTYPE html>\n" +
            "\t<html>\n" +
            "\t<head>\n" +
            "\t<style>\n" +
            "\t@import url(https://fonts.googleapis.com/css?family=Satisfy);\n" +
            "\t@import url(https://fonts.googleapis.com/css?family=Six+Caps);\n" +
            "\tbody {background: url(\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAWkAAAFyCAMAAAAAtNskAAAA5FBMVEUVQk8VQlAVQ1AVQ1EVQ1IVRFIVRFMVRFQVRVQVRVUVRVYVRlYVRlcVR1cVR1gVR1kVSFkVSFoVSFsVSVsVSVwVSV0VSl0VSl4VS14VS18VS2AVTGAVTGEVTGIVTWIVTWMVTWQVTmQVTmUVT2UVT2YVT2cVUGcVUGgVUGkVUWkVUWoVUWsVUmsVUmwVU2wVU20VU24VVG4VVG8VVHAVVXAVVXEVVXIVVnIVVnMVV3MVV3QVV3UVWHUVWHYVWHcVWXcVWXgVWXkVWnkVWnoVW3oVW3sVW3wVXHwVXH0VXH4VXX4VXX8qZRc\");text-align: center;}\n" +
            "\t.halo {background-image: radial-gradient(transparent, rgba(0, 0, 0, 0.6));bottom: 0;left: 0;position: fixed;right: 0;top: 0;pointer-events: none;}\n" +
            "\t.intr {color: rgb(230, 200, 160);display: block;font-family: 'Satisfy', cursive;font-size: 32px;text-shadow: 1px 1px black;transform: rotate(-10deg);}\n" +
            "\t.intt {transform: rotate(-10deg) translate(-20px, 15px);}\n" +
            "\t.intnu{background: rgb(240, 200, 160);border: 1px dotted rgb(20, 60, 80);\tcolor: rgb(20, 60, 80);\tdisplay: inline-block;\tfont-family: sans-serif;font-size: 12px;font-weight: bolder;padding: 4px 6px 2px;position: absolute;text-shadow: none;transform: rotate(-10deg) translate(20px, -25px);}\n" +
            "\t.vt__container {display: inline-block;\tmargin: 25px auto 40px;\t}\n" +
            "\t.vt {font-family: 'Six Caps', sans-serif;font-size: 192px;letter-spacing: 10px;line-height: 1;margin: 0;position: relative;}\n" +
            "\t.vtt {\tbackground: linear-gradient(rgb(240, 220, 200), rgb(230, 200, 160));-webkit-background-clip: text;background-clip: text;position: absolute;z-index: 1;-webkit-text-fill-color: transparent;text-fill-color: transparent;}\n" +
            "\t.vtb {text-shadow:2px 1px rgb(85, 10, 0),4px 2px rgb(90, 15, 5),6px 4px rgb(100, 20, 15),8px 5px rgb(105, 25, 20),10px 6px rgb(110, 30, 25),12px 7px rgb(115, 30, 30),14px 8px rgb(120, 30, 35),16px 9px black,18px 10px black,20px 11px black,22px 12px black,24px 13px black,28px 14px rgba(0, 0, 0, 0.9),30px 15px rgba(0, 0, 0, 0.7),32px 16px rgba(0, 0, 0, 0.5),34px 17px rgba(0, 0, 0, 0.3),36px 18px rgba(0, 0, 0, 0.1),40px 20px rgba(0, 0, 0, 0.1);}\n" +
            "\t.derr {color: white;font-family: 'Satisfy', cursive;font-size: 16px;}\n" +
            "\t</style>\n" +
            "\t<title>The Pornolizer: The Original Digital Sin</title>\n" +
            "\t</head>\n" +
            "\t<body>\n" +
            "\t<div class=\"halo\"></div>\n" +
            "\t<div style=\"position: fixed;top: 50%;left: 50%;transform: translate(-50%, -50%);text-align: center\">\n" +
            "\t<div>\n" +
            "\t<span class=\"intr intt\">The</span>\n" +
            "\t<span class=\"intr\">Original Digital Sin</span>\n" +
            "\t</div>\n" +
            "\t<div class=\"vt__container\">\n" +
            "\t<p class=\"vt vtt\">PORNOLIZER</p>\n" +
            "\t<p class=\"vt vtb\">PORNOLIZER</p>\n" +
            "\t</div>\n" +
            "\t<div>\n" +
            "\t<form action=\"/pornolize\" method=\"get\">\n" +
            "\t<select name=\"lang\">\n" +
            "\t<option selected=\"selected\" value=\"en\">English</option>\n" +
            "\t<option value=\"dk\">Dansk</option>\n" +
            "\t<option value=\"de\">Deutsch</option>\n" +
            "\t<option value=\"es\">Espan&#245;l</option>\n" +
            "\t<option value=\"hr\">Hrvatska</option>\n" +
            "\t<option value=\"hu\">Magyar</option>\n" +
            "\t<option value=\"no\">Norsk</option>\n" +
            "\t<option value=\"se\">Svensk</option>\n" +
            "\t</select>\n" +
            "\t\t<input name=\"url\" type=\"text\" value=\"http://\"/>\n" +
            "\t\t<input type=\"submit\" value=\"Translate\" class=\"button\" />\n" +
            "\t\t</form>\n" +
            "\t\t</div>\n" +
            "\t\t<div><br />\n" +
            "\t\t<span class=\"derr\">\n" +
            "\t\t\t&copy;2021  <a href=\"https://www.andydixon.com/\" style=\"color:#ffffff;text-decoration:none; font-weight: bold\">Andy Dixon</a> - Version 8.0\n" +
            "     \t</span>\n" +
            "\t\t</div>\n" +
            "\t\t</div>\n" +
            "\t\t<!-- Global site tag (gtag.js) - Google Analytics -->\n" +
            "\t\t<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-76162478-4\"></script>\n" +
            "\t\t<script>\n" +
            "\t\t  window.dataLayer = window.dataLayer || [];\n" +
            "\t\t    function gtag(){dataLayer.push(arguments);}\n" +
            "\t\t      gtag('js', new Date());\n" +
            "\t\t        gtag('config', 'UA-76162478-4');\n" +
            "\t\t\t</script>\n" +
            "\t\t</body>";
}
