package com.example.projectcwh;

import java.util.Stack;

public class jstack {
    public static void main(String[] args) {
        Stack <Character> st = new Stack<>();

        st.push('(');
        st.push('}');

        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
