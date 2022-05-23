package romanToInt;

public class romanToInt {

    public static int processRomanToInt(String s) {

        int resultado = 0;
        char[] roman = s.toCharArray();

        if (roman.length >= 1 && roman.length <= 15) {
            for (int i = 0; i < roman.length; i++) {

                switch (roman[i]) {
                    case 'I':
                        resultado += 1;
                        break;
                    case 'V':
                        if (i == 0) {
                            resultado += 5;
                        } else {
                            if (roman[i - 1] == 'I') {
                                resultado += 4 - 1;
                            } else {
                                resultado += 5;
                            }
                        }
                        break;
                    case 'X':
                        if (i == 0) {
                            resultado += 10;
                        } else {
                            if (roman[i - 1] == 'I') {
                                resultado += 9 - 1;
                            } else {
                                resultado += 10;
                            }
                        }
                        break;
                    case 'L':
                        if (i == 0) {
                            resultado += 50;
                        } else {
                            if (roman[i - 1] == 'X') {
                                resultado += 40 - 10;
                            } else {
                                resultado += 50;
                            }
                        }
                        break;
                    case 'C':
                        if (i == 0) {
                            resultado += 100;
                        } else {
                            if (roman[i - 1] == 'X') {
                                resultado += 90 - 10;
                            } else {
                                resultado += 100;
                            }
                        }
                        break;
                    case 'D':
                        if (i == 0) {
                            resultado += 500;
                        } else {
                            if (roman[i - 1] == 'C') {
                                resultado += 400 - 100;
                            } else {
                                resultado += 500;
                            }
                        }
                        break;
                    case 'M':
                        if (i == 0) {
                            resultado += 1000;
                        } else {
                            if (roman[i - 1] == 'C') {
                                resultado += 900 - 100;
                            } else {
                                resultado += 1000;
                            }
                        }
                        break;
                }
            }
            return resultado;
        } else {
            return resultado;
        }

    }

}
