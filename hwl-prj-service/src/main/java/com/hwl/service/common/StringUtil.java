package com.hwl.service.common;

public class StringUtil
{
  public static boolean isValidDouble(String str, boolean isNegative)
  {
    if (str == null)
    {
      return false;
    }
    double dblString;
    try {
      dblString = Double.valueOf(str.trim()).doubleValue();
    }
    catch (Exception exc)
    {
      return false;
    }

    return (isNegative) || (dblString >= 0.0D);
  }

  public static boolean isEmpty(String str)
  {
    return (str == null) || (str.trim().equals(""));
  }

  public static boolean isNumeric(String str)
  {
    if (str == null) {
      return false;
    }
    int strLen = str.length();

    if (strLen < 1) {
      return true;
    }
    for (int i = 0; i < strLen; i++)
    {
      if ((!Character.isDigit(str.charAt(i))) && (!Character.isWhitespace(str.charAt(i)))) {
        return false;
      }
    }
    return true;
  }

  public static boolean isAlphabet(String str)
  {
    if (str == null) {
      return false;
    }
    int strLen = str.length();

    if (strLen < 1) {
      return true;
    }
    for (int i = 0; i < strLen; i++)
    {
      if ((!Character.isLetter(str.charAt(i))) && (!Character.isWhitespace(str.charAt(i)))) {
        return false;
      }
    }
    return true;
  }

  public static boolean checkStringFormat(String str, String format)
  {
    boolean result = true;

    if (str.length() != format.length()) {
      return false;
    }
    for (int i = 0; i < str.length(); i++)
    {
      char formatChar = format.charAt(i);
      char thisChar = str.charAt(i);
      switch (formatChar)
      {
      case 'A':
        if (((thisChar >= 'A') && (thisChar <= 'Z')) || ((thisChar >= 'a') && (thisChar <= 'z'))) continue;
        result = false; break;
      case '9':
        if ((thisChar >= '0') && (thisChar <= '9')) continue;
        result = false; break;
      case '$':
        if (((thisChar < 'A') || (thisChar > 'Z')) && ((thisChar < 'a') || (thisChar > 'z')) && ((thisChar < '0') || (thisChar > '9'))) continue;
        result = false; break;
      default:
        result = false;
      }
    }
    return result;
  }

  public static boolean isAlphabet(char c)
  {
    if ((getASCIICode(c) >= 97) && (getASCIICode(c) <= 122)) return true;
    return (getASCIICode(c) >= 65) && (getASCIICode(c) <= 90);
  }

  public static boolean isNumeric(char c)
  {
    return (getASCIICode(c) >= 48) && (getASCIICode(c) <= 57);
  }

  public static int getASCIICode(char c)
  {
    return c;
  }

  public static int getIntValue(char c)
  {
    String s = String.valueOf(c);
    return Integer.parseInt(s);
  }

  public static boolean checkEmail(String strMailAddress)
  {
    boolean result = true;
    if (strMailAddress == null) return false;
    if (strMailAddress.equals("")) return true;
    if ((strMailAddress.indexOf("@") < 0) || (strMailAddress.indexOf(".") < 0)) return false;
    for (int i = 0; i < strMailAddress.length(); i++)
    {
      if ((Character.isWhitespace(strMailAddress.charAt(i))) || (Character.isLetterOrDigit(strMailAddress.charAt(i))) || (strMailAddress.charAt(i) == '@') || (strMailAddress.charAt(i) == '.') || (strMailAddress.charAt(i) == '_'))
        continue;
      result = false;
    }
    return result;
  }

  public static boolean checkTelNumber(String strTelNumber)
  {
    boolean result = true;
    if (strTelNumber == null) return false;
    if (strTelNumber.equals("")) return true;
    for (int i = 0; i < strTelNumber.length(); i++)
    {
      if ((Character.isDigit(strTelNumber.charAt(i))) || (strTelNumber.charAt(i) == '-') || (strTelNumber.charAt(i) == '(') || (strTelNumber.charAt(i) == ')'))
        continue;
      result = false;
    }
    return result;
  }

  public static String replaceQuotationMarks(String str)
  {
    if (str == null) return str;
    StringBuffer strBuf = new StringBuffer("");
    for (int i = 0; i < str.length(); i++)
    {
      char c = str.charAt(i);
      if (c == '\'')
      {
        strBuf.append('\'');
        strBuf.append('\'');
      }
      else {
        strBuf.append(c);
      }
    }
    return strBuf.toString();
  }

  public static String parseHtml(String str)
  {
    if ((str == null) || (str.length() == 0))
    {
      return str;
    }
    char[] aryToParse = str.toCharArray();
    StringBuffer strBf = new StringBuffer();

    for (int i = 0; i < aryToParse.length; i++)
    {
      char c = aryToParse[i];
      switch (c) {
      case '<':
        strBf.append("&lt;"); break;
      case '>':
        strBf.append("&gt;"); break;
      case '&':
        strBf.append("&amp;"); break;
      case '"':
        strBf.append("&quot;"); break;
      case ' ':
        strBf.append("&nbsp;"); break;
      default:
        strBf.append(c);
      }
    }
    String tmp = strBf.toString();
    tmp = tmp.replaceAll("\n", "<br>");
    tmp = tmp.replaceAll("\t", "   ");
    return tmp;
  }

  public static String parseQuoter(String str)
  {
    return str.replaceAll("'", "''");
  }

  public static String getIdxValue(String srcStr, String dividStr, int idx) {
    int i = 0;
    String result = "";
    while (i <= idx)
    {
      int idx1 = srcStr.indexOf(dividStr);
      if (idx1 == -1)
      {
        result = srcStr;
        break;
      }
      result = srcStr.substring(0, idx1);
      srcStr = srcStr.substring(idx1 + 1, srcStr.length());
      i++;
    }
    return result;
  }
}