package com.icinfo.frk.business;


import java.util.Random;

public class MppTest {

    public static String getRandomString(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
       
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            System.out.println("can not find Driver");
//            e.printStackTrace();
//        }
//        String url = "jdbc:postgresql://59.202.249.163:25308/postgres";
//        Properties props = new Properties();
//        props.setProperty("user", "omm");
//        props.setProperty("password", "Gaussdba@Mpp");
//
//        try {
//            Connection con = DriverManager.getConnection(url, props);
//            con.setAutoCommit(false);
//
//            CopyManager cm = null;
//            StringReader sr = null;
//            String sql = "copy test from STDIN CSV";
//            cm = new CopyManager((BaseConnection) con);
//
//            StringBuffer tuples = new StringBuffer();
//            for (int j = 0; j < 10000; j++) {
//                tuples.append(j + "," + getRandomString(1000) + "\n");
//            }
//            sr = new StringReader(tuples.toString());
//            long starttime = System.currentTimeMillis();
//            long rows = cm.copyIn(sql, sr);// 执行copy入库
//            con.commit();// 提交
//            long endtime = System.currentTimeMillis();
//            long costs = endtime - starttime;
//            System.out.println(rows + " rows, costs " + costs + " ms");
//            con.close();
//        } catch (Exception se) {
//            se.printStackTrace();
//        }
    }
}
