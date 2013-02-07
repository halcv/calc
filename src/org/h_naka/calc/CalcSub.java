package org.h_naka.calc;

public class CalcSub implements OnCalcListener {
    private String [] m_Args;

    public CalcSub(String [] args) {
        m_Args = args;
    }

    public void start() {
        Calc calc = new Calc();
        calc.setOnCalcListener(this);
        
        if (m_Args[2].equals("+")) {
            calc.add(Integer.parseInt(m_Args[0]),Integer.parseInt(m_Args[1]));
        } else if (m_Args[2].equals("-")) {
            calc.sub(Integer.parseInt(m_Args[0]),Integer.parseInt(m_Args[1]));
        } else if (m_Args[2].equals("x")) {
            calc.multi(Integer.parseInt(m_Args[0]),Integer.parseInt(m_Args[1]));
        } else if (m_Args[2].equals("/")) {
            calc.div(Integer.parseInt(m_Args[0]),Integer.parseInt(m_Args[1]));
        } else if (m_Args[2].equals("%")) {
            calc.mod(Integer.parseInt(m_Args[0]),Integer.parseInt(m_Args[1]));
        } else {
            System.out.println("USAGE java org.h_naka.calc.CalcMain 10 20 +");
        }
    }

    public void onFinish(int result) {
        System.out.println(result);
    }

    public void onFinish(double result) {
        System.out.println(result);
    }
}