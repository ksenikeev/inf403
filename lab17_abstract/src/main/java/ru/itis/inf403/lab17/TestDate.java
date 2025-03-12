package ru.itis.inf403.lab17;

import java.io.File;
import java.util.Base64;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        System.out.println(new Date(1741195972L*1000));
//        String jwt = new String(Base64.getDecoder().decode("eyJ2ZXIiOjEsInR5cCI6IkpXVCIsInNidCI6ImFjY2VzcyIsImFsZyI6IkdPU1QzNDEwXzIwMTJfMjU2In0.eyJzY29wZSI6Imh0dHA6XC9cL2xrLmdvc3VzbHVnaS5ydVwvYXBpLW9yZGVyIGh0dHA6XC9cL2xrLmdvc3VzbHVnaS5ydVwvYXBpLWdlcHMgaHR0cDpcL1wvZXNpYS5nb3N1c2x1Z2kucnVcL29yZ19pbmY_b3JnX29pZD0xMDAyNDEyODAwIiwiaXNzIjoiaHR0cDpcL1wvZXNpYS1wb3J0YWwxLnRlc3QuZ29zdXNsdWdpLnJ1XC8iLCJ1cm46ZXNpYTpzaWQiOiI3MzMyODUwOC0yZTdiLTQxNWYtYjJmYi05NTA3NWJkMGNmNGEiLCJ1cm46ZXNpYTpzYmpfaWQiOjEwMDI0MjQ3NzYsImV4cCI6MTc0MTE5NTk3MiwiaWF0IjoxNzQxMTA5NTcyLCJjbGllbnRfaWQiOiJDT05USU5FTlRTRVJWSUNFIn0.DTR6Sn-WQtJTX8a-k0MJbjCfNSutFLEX8505_dNTPcGIMCL0bO3N78Th5uyg5zg62KwZBt90Ia4wdJ3YN191OQ"));
        String tkn = "eyJ2ZXIiOjEsInR5cCI6IkpXVCIsInNidCI6ImFjY2VzcyIsImFsZyI6IkdPU1QzNDEwXzIwMTJfMjU2In0.eyJzY29wZSI6Imh0dHA6XC9cL2xrLmdvc3VzbHVnaS5ydVwvYXBpLW9yZGVyIGh0dHA6XC9cL2xrLmdvc3VzbHVnaS5ydVwvYXBpLWdlcHMgaHR0cDpcL1wvZXNpYS5nb3N1c2x1Z2kucnVcL29yZ19pbmY_b3JnX29pZD0xMDAyNDEyODAwIiwiaXNzIjoiaHR0cDpcL1wvZXNpYS1wb3J0YWwxLnRlc3QuZ29zdXNsdWdpLnJ1XC8iLCJ1cm46ZXNpYTpzaWQiOiI3MzMyODUwOC0yZTdiLTQxNWYtYjJmYi05NTA3NWJkMGNmNGEiLCJ1cm46ZXNpYTpzYmpfaWQiOjEwMDI0MjQ3NzYsImV4cCI6MTc0MTE5NTk3MiwiaWF0IjoxNzQxMTA5NTcyLCJjbGllbnRfaWQiOiJDT05USU5FTlRTRVJWSUNFIn0.DTR6Sn-WQtJTX8a-k0MJbjCfNSutFLEX8505_dNTPcGIMCL0bO3N78Th5uyg5zg62KwZBt90Ia4wdJ3YN191OQ";
        int p = tkn.indexOf('.');
        int d = tkn.indexOf('.', p + 1);
        String jwt = new String(Base64.getUrlDecoder().decode(tkn.substring(p + 1, d)));

        p = jwt.indexOf("exp");
        d = jwt.indexOf(":", p);
        int c = jwt.indexOf(",", d);
        long t = Long.parseLong(jwt.substring(d + 1,c).trim());
        System.out.println(t);
        System.out.println(new Date(t * 1000));

        File dirPath = new File("/home/continent/workdata/epgu", "reg/" + 197 ); //+ 197 + "/" + 119203487
        if (!dirPath.exists()) {
            System.out.println(dirPath.mkdir());
        }

        dirPath = new File(dirPath.getAbsolutePath(), String.valueOf(119203487));
        if (!dirPath.exists()) {
            System.out.println(dirPath.mkdir());
        }
    }
}
//1741141594133
//1741195972