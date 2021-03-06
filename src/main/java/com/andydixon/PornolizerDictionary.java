package com.andydixon;

import java.util.Random;

public class PornolizerDictionary {

    public String[] adjectives;
    public String[] names;
    public String language;

    public PornolizerDictionary(String language) {
        this.language=language;
        if (language == "en") {
            this.adjectives = new String[]{"fuck", "smooch", "smack", "peck", "unclefuck", "spank", "motherfuck", "deep throat", "ballbust", "spew", "dripp",
                    "thrust", "cocksuck", "fistfuck", "fist", "suck", "squirt", "wank", "bang", "brown", "cuntlick", "cuntlapp", "felch",
                    "fingerfuck", "gangbang", "plow", "raunch", "screw", "sex fight", "titty fuck", "enter", "raid", "jerk", "finger",
                    "shaft", "blow", "lick", "asslick", "fuck", "assfuck", "wad pull", "muff sniff", "aardvark", "ball", "barf", "charver",
                    "cream", "fart", "fomp", "gamahuche"};
            this.names = new String[]{"Big Cock", "Fuck me for a Buck", "Dirk Diggler", "Big Dick", "Give it to me", "Cock Sucker", "Up the Arse",
                    "Cockboy", "Omar Pussy", "Fat Ass", "Superdick", "Mistress Shiva", "Bite Me", "Mistress Anal", "Long Finger", "Plugin", "Anal",
                    "Ass-stitcher", "Jar Jar", "Bust-a-Cunt", "Buzzwordbaby", "Sniff-my-Ass", "Dripper Dick", "Butplug", "The-Champ", "Fill me up",
                    "Suck my tits dry", "Ball Buster", "Dildo", "Motherfucker", "Dickwad", "Fuckface", "Jerkoff", "Bitch", "Bastard", "Asshole",
                    "Hard-on", "Pimp Mastah", "Son of a whore", "Muffdiver", "Rugmuncher", "Admiral Browning", "Afterburner", "Airing the Orchid",
                    "Aphrodite's Evostick", "Ballbuffer", "Muffmuncher", "Cuntcleaner", "Mount Thrushmore", "Scrotscrubber", "Muffminer", "Anusapple",
                    "Mouth-full-o'-cock", "Nobgoblin", "Fannyfarmer", "Spunksupper", "Clitcollector", "Bumbanger", "Assrush", "Bonebagger", "Saggysack",
                    "Cumbucket", "King Choad"};
        } else if (language == "de") {
            this.adjectives = new String[]{"fotzenleck", "arschbums", "wixefress", "niedernudeln", "herknecht", "drüberbürst", "niederknall", "penislutsch",
                    "pimmelsaug", "niederschnalz", "fleischlutsch", "analpenetrier", "rosettenreit", "schwanzlutsch", "bums", "fick",
                    "saug", "schleck", "arschfick", "fotzereib", "wichs", "muttifick", "analsaug", "masturbier", "faustfick", "schleimscheiß",
                    "schwanzsaug", "schwanzfick", "pimmelsaug", "tittensaug", "flöt", "möpsesaug"};
            this.names = new String[]{"Popopirat", "Samenstau", "Lutsch du Luder", "Rosettenslasher", "Wundfick", "Fickapparat", "Analsonde", "Spermagarage", "Eiterfotze",
                    "Flatterfotze", "Resteficker", "Analraupe", "Spermagurgler", "Analprinz", "Analkanal", "Analhölenforscher", "Schimmelpimmel", "Schwanzpastete",
                    "Prärieficker", "Analspecht", "Rosettentester", "Vorbläser", "Hühnerficker", "Ziegenficker", "Analgeneral", "Fickmonster", "Schluck du Luder",
                    "Rosettenrohrkrepierer", "Rustikalfick", "Hodensauger", "Samenstaumechaniker", "Popostecher", "Steckdosenbefruchter", "Analtorpedo",
                    "Spermarutsche", "Fotzenkäse", "Hodenkobolt", "Analfrosch", "Wichsfresse", "Penisgesicht", "Fickfetzen", "Affenschwanz", "Arschficker",
                    "Wichser", "Puffmutter", "Drecksau", "Arschgeiger", "Hurensohn", "Blas mir einen", "Dunkelbumser", "Ficksau", "Kekserlwichser", "Eisenbanger",
                    "Fleischknüppel", "Hodenvernichter", "Fotze", "Fotzenknecht", "Fotzendrescher", "Analfeuerwerk", "Leichenfick", "Sackgelutsche", "Analritter",
                    "Analpirat", "Kanalonanierer", "Schnalzhengst", "Elefantenprügel", "Ochsenpimmel", "Vaginalmassage", "Geisterscheisse", "Zieh an meinen Eiern",
                    "Massier mir die Rosette", "Rosette", "Saugsklave", "Drecksfotze", "Hängepimmel"};
        } else if (language == "dk") {
            this.adjectives = new String[]{"pul", "knepp", "voldtag", "boll", "spank", "røvpul", "fistfuck", "prygl", "riv", "sut", "rid", "masturber", "onaner", "voldknepp", "fuck", "suck"};
            this.names = new String[]{"Cocksucker", "Asslicker", "Horselover", "Horse Dick", "Knepp din mor", "Sut min pik", "Fat Ass", "Fistfucker", "Røvpuler", "Dominatrix",
                    "Penetrator", "Fuck me for a Buck", "Dirk Diggler", "Big Dick", "Give it to me", "Fittesnik", "Cock Sucker", "Up the Arse", "Cockboy",
                    "Omar Pussy", "Fat Ass", "Wide Canyon", "Superdick", "Bed Buster", "Mistress Shiva", "Bite Me", "Mistress Anal", "Anal Kanal ", "Long Finger",
                    "Plugin", "Anal", "Ass-stitcher", "Jar Jar", "Bust-a-Cunt", "Slingre Fitte", "Wet Sex", "Buzzwordbaby", "Sniff-my-Ass", "Dripper Dick", "Butplug",
                    "The-Champ", "Fill me up", "Suck my tits dry"};
        } else if (language == "es") {
            this.adjectives = new String[]{"foll", "dilat", "chup", "encul", "insult", "cag", "me", "eyacul", "pute", "fornic", "viol", "escup"};
            this.names = new String[]{"culo de gordo de", "chocho de caliente de", "hijo de puta de", "chupa de pollas de", "come de mierda de"};
        } else if (language == "hr") {
            this.adjectives = new String[]{"jeb-anje-ao-ala-ite", "liz-anje-ao-ala-ite", "kar-anje-ao-ala-ajte", "tuc-anje-ao-ala-ajte", "trp-anje-ao-ala-ajte",
                    "kres-anje-ao-ala-ite", "pis-anje-ao-ala-ajte", "svrsav-anje-ao-ala-ajte", "dudl-anje-ao-ala-ajte", "pus-enje-io-ila-ite",
                    "guz-enje-io-ila-ite", "bar-enje-io-ila-ite", "gaz-enje-io-ila-ite"};
            this.names = new String[]{"dugi", "jebozov", "kucka", "koji kurac", "kurva", "picka", "bradavica", "bradavice k'o karfioli", "guzonja", "jebo sliku svoju", "dupe",
                    "cmar", "prstenac", "pickin dim", "picopevac", "koji kurac palac", "jebo mamu", "jebo sestru", "jebo jeza", "iskusni"};
        } else if (language == "hu") {
            this.adjectives = new String[]{"buziz", "felbasz", "geciz", "szop", "beszív", "beszop", "anyáz", "szopat", "szar", "fing", "kibasz", "benyal", "elfaszoskod",
                    "pisál", "lekurváz", "szájbabasz", "genyáz", "mókáz", "fos", "recskáz", "szétbasz", "majomkod", "baromkod", "szomorkod", "kifing",
                    "izmoz", "kukiz", "fikáz", "masztiz", "turház", "bunkóz"};
            this.names = new String[]{"Nagy Fasz", "Kúrd A Seggem", "Faszdörgölõ", "Pöcsmag", "Ánuszszaggató", "Kékeres Méteres", "Seggdugasz", "Csirkebaszó", "Pöttöm Kuki",
                    "Fideszközeli", "Pöcshuszár", "Puncivitéz", "Rongyosra Baszlak", "Huncut A Seggem", "Õsparaszt", "Családunk Hímtagja", "Tedd A Seggembe",
                    "Vadvalagú", "Hájas Valag", "Harapj Belém", "Hervadt Fasz", "Rojtos Puncus", "Puncimókus", "A Hosszú", "Csöpög A Pöcsöm", "Dikkmá",
                    "Királyi Fallosz", "Buzinak Születtem", "Baszomalássan", "Xavér", "Murváspöcsû", "Züllött Farokverõ", "Csiklókandúr", "Égszinkék Heregolyó",
                    "A Legkissebb Ugrifüles", "Faszverõ Szamuráj", "Démoni Faszharcos", "Pernahajder Campbell", "Gézengúz Recskabajnok", "Kinyírom Mindet!",
                    "Masszív Fasz", "Gazsi", "Oktondi", "Punnyadt Punci"};
        } else if (language == "no") {
            this.adjectives = new String[]{"pul", "slikk", "knull", "rævkjør", "skamknull", "runk", "spank", "sug", "høvl", "bakpul", "fist", "møljejukk", "tvangspul",
                    "drit", "jukk", "grafs", "nevepul", "fittegnukk", "kuksprut", "forderv", "svimepul", "masturber", "kukkspreng", "sædslikk",
                    "gjengpul", "sprengpul", "fittefyll", "grøfteknull", "fittepryl", "flaskeknull", "fittepryl", "svelg", "svett", "rævslikk",
                    "romperes", "tarmfres", "tafs", "likpul", "blodsug", "kuksug"};
            this.names = new String[]{"Big Cock", "Fuck me for a Buck", "Dirk Diggler", "Big Dick", "Give it to me", "Fittesnik", "Cock Sucker", "Up the Arse", "Mr. Bolt i tvåan",
                    "Smellan i tvåan", "Cockboy", "Omar Pussy", "Fat Ass", "Superdick", "Mistress Shiva", "Bite Me", "Mistress Anal", "Anal Kanal", "Romperæseren",
                    "Long Finger", "Plugin", "Anal", "Ass-stitcher", "Jar Jar", "Bust-a-Cunt", "Slingre Fitte", "Buzzwordbaby", "Hengepikk", "Sniff-my-Ass", "Luremus",
                    "Dripper Dick", "Slurpe Fitte", "Butplug", "Fjellkuk", "The-Champ", "Fill me up", "Suck my tits dry", "Tarmslyng", "Tarmen elektra", "Fluffy pung",
                    "Flyffy pikk", "Bygdehomo", "Slingrefitte", "Lille gutt", "Gamle Erik", "Stål ånde", "Fantomkuk", "Spybøtte", "Råtefitte", "Stålfitte", "Hengemus",
                    "Fitteleppe", "Hengeballe", "Stålkuk", "Hårball", "Pelsdott", "Kukhode", "Hengepupp", "Svulmemus", "Trekuk", "Kukskalle", "Panserpung", "Kukost",
                    "Up the bum"};
        } else if (language == "se") {
            this.adjectives = new String[]{"knull", "slick", "rövknull", "skamknull", "runk", "spank", "fist", "tvångsknull", "bajs", "juck", "tafs", "pull", "fittgnid",
                    "kuksprut", "simknull", "masturber", "dumkåt", "svälj", "gangbang", "dragg", "flaskknull", "åderpål", "spett", "fuck", "bakis-knull",
                    "fylle-juck", "drägg-knull "};
            this.names = new String[]{"Big Cock", "Fuck me for a Buck", "Dirk Diggler", "Big Dick", "Give it to me", "Fittesnik", "Cock Sucker", "Up the Arse",
                    "Mr. Bolt i tvåan", "Smellan i tvåan", "Cockboy", "Omar Pussy", "Fat Ass", "Superdick", "Mistress Shiva", "Bite Me", "Mistress Anal",
                    "Anal Kanal ", "Romperæseren", "Long Finger", "Plugin", "Anal", "Ass-stitcher", "Jar Jar", "Bust-a-Cunt", "Slingre Fitte", "Buzzwordbaby",
                    "Hengepikk", "Sniff-my-Ass", "Luremus", "Dripper Dick", "Slurpe Fitte", "Butplug", "Fjellkuk", "The-Champ", "Fill me up", "Suck my tits dry",
                    "Åderpåle", "Balle", "Åka skinnhiss", "Gå ut med hunden", "Hälsa på monstret", "Lira skinnflöjt", "Smörja spettet", "Fisken", "Jacket",
                    "Springan", "Spettar", "Fuckar", "Bakis-knull", "Fylle-juck", "Drägg-knull"};
        }
    }

    public String randomName() {
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public String randomAdjective() {
        Random random = new Random();
        return adjectives[random.nextInt(adjectives.length)];
    }


}
