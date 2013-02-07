package org.h_naka.calc;

public class Calc {
    private OnCalcListener m_Listener;
    
    public Calc() {
        m_Listener = null;
    }
    
    public void add(int x,int y) {
        int ans = x + y;
        setAnser(ans);
    }

    public void sub(int x,int y) {
        int ans = x - y;
        setAnser(ans);
    }

    public void multi(int x,int y) {
        int ans = x * y;
        setAnser(ans);
    }

    public void div(int x,int y) {
        double ans = (double)x / (double)y;
        setAnser(ans);
    }

    public void mod(int x,int y) {
        int ans = x % y;
        setAnser(ans);
    }

    public void setOnCalcListener(OnCalcListener listener) {
        m_Listener = listener;
    }

    private void setAnser(int ans) {
        if (m_Listener != null) {
            m_Listener.onFinish(ans);
        }
    }

    private void setAnser(double ans) {
        if (m_Listener != null) {
            m_Listener.onFinish(ans);
        }
    }
}
