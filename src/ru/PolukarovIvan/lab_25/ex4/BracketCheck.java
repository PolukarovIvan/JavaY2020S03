package ru.PolukarovIvan.lab_25.ex4;

import java.util.Stack;

public class BracketCheck {
    static Stack<Boolean> st = new Stack<>();

    public static boolean check(String str) {
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                st.add(true);
            }
            if(str.charAt(i) == ')'){
                try{
                    st.pop();
                } catch (Exception e){
                    return false;
                }
            }
        }
        return (st.empty());
    }
}
