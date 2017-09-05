
public class RomanCalculator {

	final static String ROME1 = "I";
	final static String ROME5 = "V";
	final static String ROME10 = "X";
	final static String ROME50 = "L";
	final static String ROME100 = "C";
	final static String ROME500 = "D";
	final static String ROME1000 = "M";

	final static int ROME_NUM1 = 1;
	final static int ROME_NUM5 = 5;
	final static int ROME_NUM10 = 10;
	final static int ROME_NUM50 = 50;
	final static int ROME_NUM100 = 100;
	final static int ROME_NUM500 = 500;
	final static int ROME_NUM1000 = 1000;

	final static int START_NUM = 1;
	final static int END_NUM = 3999;

	final static String ERR_MSG_1 = "変換できません";
	final static String SUCCESS_MSG_1 = "SUCCESS";

	public static String add(String augend,String addend){
		int augendInt = RomToArab(augend);
		int addendInt = RomToArab(addend);

		return ArabToRom(augendInt + addendInt);
	}

	public static String sub(String minuend,String substrahend){
		int minuendInt = RomToArab(minuend);
		int substrahendInt = RomToArab(substrahend);

		return ArabToRom(minuendInt - substrahendInt);
	}

	public static String mul(String multiplicand,String multiplier){
		int multiplicandInt = RomToArab(multiplicand);
		int multiplierInt = RomToArab(multiplier);

		return ArabToRom(multiplicandInt * multiplierInt);
	}

	public static String div(String dividend,String divisor){
		int dividendInt = RomToArab(dividend);
		int divisorInt = RomToArab(divisor);

		return ArabToRom(dividendInt / divisorInt);
	}

	public static String ArabToRom(int arabiaNum) {

		String result = "";
		while (arabiaNum != 0) {
			if ((ROME_NUM1 <= arabiaNum) && (arabiaNum < ROME_NUM5)) {
				if ((arabiaNum + ROME_NUM1) == ROME_NUM5) {
					result = result + ROME1;
					arabiaNum += ROME_NUM1;
				} else {
					result = result + ROME1;
					arabiaNum -= ROME_NUM1;
				}
			} else if ((ROME_NUM5 <= arabiaNum) && (arabiaNum < ROME_NUM10)) {
				if ((arabiaNum + ROME_NUM1) == ROME_NUM10) {
					result = result + ROME1;
					arabiaNum += ROME_NUM1;
				} else {
					result = result + ROME5;
					arabiaNum -= ROME_NUM5;
				}
			} else if ((ROME_NUM10 <= arabiaNum) && (arabiaNum < ROME_NUM50)) {
				if ((arabiaNum >= 40)) {
					result = result + ROME10;
				    arabiaNum += ROME_NUM10;
				} else {
					result = result + ROME10;
				    arabiaNum -= ROME_NUM10;
				}
			} else if ((ROME_NUM50 <= arabiaNum) && (arabiaNum < ROME_NUM100)) {
				if ((arabiaNum >= 90)) {
					result = result + ROME10;
				    arabiaNum += ROME_NUM10;
				} else {
					result = result + ROME50;
				    arabiaNum -= ROME_NUM50;
				}
			} else if ((ROME_NUM100 <= arabiaNum) && (arabiaNum < ROME_NUM500)) {
				if ((arabiaNum >= 400)) {
					result = result + ROME100;
				    arabiaNum += ROME_NUM100;
				} else {
					result = result + ROME100;
				    arabiaNum -= ROME_NUM100;
				}
			} else if ((ROME_NUM500 <= arabiaNum) && (arabiaNum < END_NUM)) {
				if ((arabiaNum >= 900) && (arabiaNum < 1000)) {
					result = result + ROME100;
				    arabiaNum += ROME_NUM100;
				} else {
					result = result + ROME1000;
				    arabiaNum -= ROME_NUM1000;
				}
			}
		}
		return result;
	}

	public static int RomToArab(String rome) {
		String[] num = rome.split("");
		int result=0;
		for(int i=0;i<num.length;i++) {
			if(i+1 == num.length) {
				result += ChangeToInt(num[i]);
				return result;
			} else {
				if(ChangeToInt(num[i]) < ChangeToInt(num[i+1])) {
					result += ChangeToInt(num[i+1]) - ChangeToInt(num[i]);
					i++;
					continue;
				} else {
					result += ChangeToInt(num[i]);
				}
 			}
		}


		return result;
	}

	public static int ChangeToInt(String rome) {
		switch (rome) {
		case "I":
			return 1;
		case "V":
			return 5;
		case "X":
			return 10;
		case "L":
			return 50;
		case "C":
			return 100;
		case "D":
			return 500;
		}
		return 1000;
	}
}
//final static String ROME1 = "I";
//final static String ROME5 = "V";
//final static String ROME10 = "X";
//final static String ROME50 = "L";
//final static String ROME100 = "C";
//final static String ROME500 = "D";
//final static String ROME1000 = "M";
