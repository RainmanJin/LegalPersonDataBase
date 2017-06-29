package com.icinfo.frk.support.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/** 
 * 描述: TODO<br>
 * @author gqf
 * @date 2015年5月13日  
 */
public class DateUtil {

	
	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @param date
	 * @param format
	 * @return 
	 */
	
	public static String dateToString(java.util.Date date, String format) {
		String result = "";
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			} catch (Exception ex) {
				result = "";
			}
		}
		return result;
	}


	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @param strDate
	 * @param format
	 * @return 
	 */
	
	public static Date stringToDate(String strDate, String format) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.parse(strDate);
		} catch (Exception er) {
			return null;
		}
	}
	
	/** 
	 * 描述: 中文日期转化日期格式
	 * @auther gqf
	 * @date 2015年5月15日 
	 * @param strDate
	 * @param format
	 * @return 
	 */
	
	public static Date chineseStrToDate(String strDate, String format){
		strDate = strDate.replace("年", "-");
		strDate = strDate.replace("月", "-");
		strDate = strDate.replace("日", "-");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.parse(strDate);
		} catch (Exception er) {
			return null;
		}
	}

	
	
	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @return 
	 */
	
	public static String getCurrentTime() {
		return dateToString(new Date(), "yyyy-MM-dd HH:mm:ss");
	}


	
	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @return 
	 */
	
	public static String getCurrentYear() {
		return dateToString(new Date(), "yyyy");
	}

	
	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @return 
	 */
	
	public static String getCurrentDate() {
		return dateToString(new Date(), "yyyy-MM-dd");
	}

	
	/** 
	 * 描述: TODO
	 * @auther gqf
	 * @date 2015年5月13日 
	 * @return 
	 */
	
	public static String getCurrentSimpleTime() {
		return dateToString(new Date(), "HH:mm:ss");
	}

	/** 
	 * 描述: 获取当前完整日期
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @return 
	 */
	public static String getCurrentSimpleDate() {
		return dateToString(new Date(), "yyyyMMdd");
	}

	/** 
	 * 描述: 把日期转成完整格式。如：2007-1-1 转化后为 2007-01-01
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param strDate
	 * @param regex
	 * @return 
	 */
	public static String toComplexDate(String strDate, String regex) {
		try {
			String tmp_date[] = strDate.split(regex);
			String tmp_year = tmp_date[0];
			String tmp_month = tmp_date[1];
			String tmp_day = tmp_date[2];
			if (Integer.parseInt(tmp_month) <= 9) {
				tmp_month = "0" + tmp_month;
			}
			if (Integer.parseInt(tmp_day) <= 9) {
				tmp_day = "0" + tmp_day;
			}
			return tmp_year + "-" + tmp_month + "-" + tmp_day;
		} catch (Exception er) {
			return strDate;
		}
	}

	/** 
	 * 描述: 获取N年后时间
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static String getNyearlater(Date date, int N) {
		try {
			Calendar now = Calendar.getInstance();
			now.setTime(date);
			now.add(Calendar.DAY_OF_YEAR, 365 * N);
			SimpleDateFormat formatter = new SimpleDateFormat(
					"yyyy-MM-dd HH:mm:ss");
			return formatter.format(now.getTime());
		} catch (Exception er) {
			return getCurrentTime();
		}
	}

	/** 
	 * 描述: 获取N年后日期
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static String getNyearlaterDate(Date date, int N) {
		try {
			Calendar now = Calendar.getInstance();
			now.setTime(date);
			now.add(Calendar.DAY_OF_YEAR, 365 * N);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			return formatter.format(now.getTime());
		} catch (Exception er) {
			return getCurrentTime();
		}
	}

	/** 
	 * 描述: 获取N年后日期对象
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static Date getNyearlaterDateObject(Date date, int N) {
		Calendar now = Calendar.getInstance();
		try {

			now.setTime(date);
			now.add(Calendar.DAY_OF_YEAR, 365 * N);

		} catch (Exception er) {
			er.printStackTrace();
		}
		return now.getTime();
	}

	/** 
	 * 描述: 获取N月后时间
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static String getNmonthlater(Date date, int N) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.MONTH, N);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(now.getTime());
	}

	/** 
	 * 描述: 获取N月后日期
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static Date getNmonthlaterDate(Date date, int N) {
		Calendar now = Calendar.getInstance();
		try {
			now.setTime(date);
			now.add(Calendar.MONTH,N);
		} catch (Exception er) {
			er.printStackTrace();
		}
		return now.getTime();
	}

	/** 
	 * 描述: 获取N天后日期(字符串形式)
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static String getNdaylater(Date date, int N) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			return formatter.format(getNdaylaterDate(date, N));
		} catch (Exception er) {
			return getCurrentTime();
		}
	}

	/** 
	 * 描述: 获取N天后日期
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static Date getNdaylaterDate(Date date, int N) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.DAY_OF_YEAR, N);
		return now.getTime();
	}

	/** 
	 * 描述: 获取N小时后时间
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static Date getNhourlater(Date date, int N) {
		long myTime = (date.getTime() / 1000) + 60 * 60 * N;
		date.setTime(myTime * 1000);
		return date;
	}

	/** 
	 * 描述: 获取N分钟后时间
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param date
	 * @param N
	 * @return 
	 */
	public static Date getNMinutelater(Date date, int N) {
		long myTime = (date.getTime() / 1000) + 60 * N;
		date.setTime(myTime * 1000);
		return date;
	}

    /** 
     * 描述: 计算两日期相差天数
     * @auther yushunwei
     * @date 2013-12-26 
     * @param smdate
     * @param bdate
     * @return
     * @throws Exception 
     */
    public static int getDaysBetween(String smdate,String bdate) throws Exception{  
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(sdf.parse(smdate));    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(sdf.parse(bdate));    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days))+1;     
    }
    
    /** 
     * 描述: 计算两日期相差天数
     * @auther yushunwei
     * @date 2013-12-26 
     * @param smdate
     * @param bdate
     * @return
     * @throws Exception 
     */
    public static int getDaysBetween(Date smdate,Date bdate) throws Exception{    
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
        smdate=sdf.parse(sdf.format(smdate));  
        bdate=sdf.parse(sdf.format(bdate));  
        Calendar cal = Calendar.getInstance();    
        cal.setTime(smdate);    
        long time1 = cal.getTimeInMillis();                 
        cal.setTime(bdate);    
        long time2 = cal.getTimeInMillis();         
        long between_days=(time2-time1)/(1000*3600*24);  
            
       return Integer.parseInt(String.valueOf(between_days))+1;           
    }
    
    /** 
     * 描述: 获取格式化后日期时间
     * @auther yushunwei
     * @date 2013-12-26 
     * @param date
     * @param format
     * @return
     * @throws Exception 
     */
    public static long getAfterFormatTime(Date date,String format) throws Exception{
    	SimpleDateFormat sdf = new SimpleDateFormat(format);
    	String fDate = sdf.format(date);
    	return sdf.parse(fDate).getTime();
    }

	/** 
	 * 描述: 计算两日期相差月数
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param beforeDate
	 * @param afterDate
	 * @return 
	 */
	public static int getBetweenMonths(String beforeDate, String afterDate) {
		try {
			int iMonth = 0;
			int flag = 0;
			try {
				DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				Date d1 = format.parse(beforeDate);
				Date d2 = format.parse(afterDate);

				Calendar objCalendarDate1 = Calendar.getInstance();
				objCalendarDate1.setTime(d1);

				Calendar objCalendarDate2 = Calendar.getInstance();
				objCalendarDate2.setTime(d2);

				if (objCalendarDate2.equals(objCalendarDate1))
					return 0;
				if (objCalendarDate1.after(objCalendarDate2)) {
					Calendar temp = objCalendarDate1;
					objCalendarDate1 = objCalendarDate2;
					objCalendarDate2 = temp;
				}
				if (objCalendarDate2.get(Calendar.DAY_OF_MONTH) < objCalendarDate1
						.get(Calendar.DAY_OF_MONTH))
					flag = 1;

				if (objCalendarDate2.get(Calendar.YEAR) > objCalendarDate1
						.get(Calendar.YEAR))
					iMonth = ((objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1
							.get(Calendar.YEAR))
							* 12
							+ objCalendarDate2.get(Calendar.MONTH) - flag)
							- objCalendarDate1.get(Calendar.MONTH);
				else
					iMonth = objCalendarDate2.get(Calendar.MONTH)
							- objCalendarDate1.get(Calendar.MONTH) - flag;

			} catch (Exception e) {
				e.printStackTrace();
			}
			return iMonth;

		} catch (Exception er) {
			return 0;
		}
	}

	/** 
	 * 描述: 计算N月之后的时间
	 * @auther yushunwei
	 * @date 2013-11-28 
	 * @param d
	 * @param i
	 * @return 
	 */
	public static Date addMonth(Date d, int i) {
		Date date = null;
		GregorianCalendar gc = new GregorianCalendar();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		gc.setTime(d);
		gc.add(Calendar.MONTH, i);
		try {
			date = sf.parse(sf.format(gc.getTime()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	 /** 
     * 描述: 比较两时间前后
     * @author 徐建军
     * @date 2013-10-8 
     * @param DATE1
     * @param DATE2
     * @return int
     */
    public static int compare_date(String DATE1, String DATE2) {
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() > dt2.getTime()) {
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }
    
	/** 
	 * 描述: 返回两个日期之间的时间 单位分钟
	 * @auther ZhouYan
	 * @date 2014-8-23 
	 * @param beforeDate
	 * @param nowDate
	 * @return 
	 */
	public static long getBetweenDaysToMut(Date beforeDate,Date nowDate){
		long myTime = (nowDate.getTime() / 1000)-(beforeDate.getTime() / 1000);
		return myTime/60;
	}
	
	/** 
	 * 描述: 格式化查询条件：起始日期
	 * @auther ZhouYan
	 * @date 2014年11月27日 
	 * @param startTime
	 * @return 
	 */
	public static Date getStartDate(String startTime) {
		if (startTime != null && startTime.length() > 0) {
			return DateUtil.stringToDate(startTime + " 00:00:00", "yyyy-MM-dd HH:mm:ss");
		}
		return null;
	}

	/** 
	 * 描述: 格式化查询条件：截止日期
	 * @auther ZhouYan
	 * @date 2014年11月27日 
	 * @param endTime
	 * @return 
	 */
	public static Date getEndDate(String endTime) {
		if (endTime != null && endTime.length() > 0) {
			return DateUtil.stringToDate(endTime + " 23:59:59", "yyyy-MM-dd HH:mm:ss");
		}
		return null;
	}
	
	/** 
	 * 描述: 获取日期多在的周几
	 * @auther ZhouYan
	 * @date 2014年11月27日 
	 * @param endTime
	 * @return 
	 */
	public static String getWeekForDate(Date date) {
		String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
	}

}
