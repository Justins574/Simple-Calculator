package edu.csus.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    static boolean inputError = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Button resultTextView = (Button) findViewById(R.id.resultTextView);

        Button openButton = (Button) findViewById(R.id.openPar);
        Button closeButton = (Button) findViewById(R.id.closePar);
        Button backspaceButton = (Button) findViewById(R.id.backspace);
        Button divideButton = (Button) findViewById(R.id.divide);

        Button sevenButton = (Button) findViewById(R.id.seven);
        Button eightButton = (Button) findViewById(R.id.eight);
        Button nineButton = (Button) findViewById(R.id.nine);
        Button multiplyButton = (Button) findViewById(R.id.multiply);

        Button fourButton = (Button) findViewById(R.id.four);
        Button fiveButton = (Button) findViewById(R.id.five);
        Button sixButton = (Button) findViewById(R.id.six);
        Button subtractButton = (Button) findViewById(R.id.subtract);

        Button oneButton = (Button) findViewById(R.id.one);
        Button twoButton = (Button) findViewById(R.id.two);
        Button threeButton = (Button) findViewById(R.id.three);
        Button addButton = (Button) findViewById(R.id.add);

        Button clearButton = (Button) findViewById(R.id.clear);
        Button zeroButton = (Button) findViewById(R.id.zero);
        Button decimalButton = (Button) findViewById(R.id.decimal);
        Button solveButton = (Button) findViewById(R.id.solveButton);


        resultTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

                String text = resultTextView.getText().toString();
                inputEditText.setText(text);

                resultTextView.setText("");

            }
        });

        zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "0");
            }
        });

        oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "1");
            }
        });

        twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "2");
            }
        });

        threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "3");
            }
        });

        fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "4");
            }
        });

        fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "5");
            }
        });

        sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "6");
            }
        });

        sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "7");
            }
        });

        eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "8");
            }
        });

        nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "9");
            }
        });

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "(");
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + ")");
            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText("");
            }
        });

        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                int length = inputEditText.getText().length();
                if (length > 0) {
                    inputEditText.getText().delete(length - 1, length);
                }
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "+");
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "-");
            }
        });

        multiplyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "*");
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + "/");
            }
        });

        decimalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                inputEditText.setText(inputEditText.getText() + ".");
            }
        });

        solveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText inputEditText =(EditText)findViewById(R.id.inputEditText);
                TextView resultTextView = (TextView)findViewById(R.id.resultTextView);

                inputError = false;

                String infix = inputEditText.getText().toString();
                infix = infix.replaceAll("\\s", "");

                //insert code from jGrasp (String postfix)
                char[] a = infix.toCharArray();                      // input string is stored into char array

                if (a.length == 0){                                  // if string is empty, can't compute
                    inputError = true;
                }

                if(!infix.matches(".*\\d.*")){                  // if string does not contain a number
                    inputError = true;
                }

                // Handle "(9)6", "(9)6-", "(9)6-8", "7(9)-"
                for (int i = 0; i < a.length; i++){

                    if(a[i] == '(' && i != 0){
                        if (Character.isDigit(a[i-1])){
                            inputError = true;
                        }
                    }
                    if(a[i] == ')' && i != a.length - 1){
                        if (Character.isDigit(a[i+1])){
                            inputError = true;
                        }
                    }

                }



                String postfix = "";
                QNode head = null;    // stack head

                for(int i = 0; i < a.length; i++){                 // loop through input

                    if (Character.isDigit(a[i]) || a[i] == '.'){

                        postfix = postfix + a[i];

                        i++;
                        if(i >= a.length){
                            break;
                        }

                        while(Character.isDigit(a[i]) || a[i] == '.'){

                            postfix = postfix + a[i];

                            i++;
                            if(i >= a.length){
                                break;
                            }
                        }

                        if(i >= a.length){
                            break;
                        }

                        postfix = postfix + " ";
                    }

                    if(a[i] == '('){
                        head = push (head, a[i]);
                    }

                    else if(a[i] == ')'){

                        if(head == null){
                            inputError = true;
                            break;
                        }

                        char j = head.data;
                        head = pop(head);

                        while (j != '('){

                            postfix = postfix + j + " ";

                            head = pop(head);
                            if (head == null)
                                break;
                            j = head.data;
                        }

                    }
                    else{                                           // else, an operator
                        if (head == null){                           // empty stack
                            head = push (head, a[i]);
                        }

                        else{                                        // stack has operator, time to compare

                            int x = pres(a[i]);
                            int top = pres(head.data);

                            if ( x > top){                            // if new operator has higher presedence than top operator
                                head = push (head, a[i]);              // push new operator
                            }

                            else{                                     // pop operators until new operator has higher presedence than top
                                while( x <= top){

                                    postfix = postfix + head.data + " ";

                                    head = pop (head);
                                    if (head == null)
                                        break;

                                    top = pres(head.data);
                                }

                                head = push (head, a[i]);               // push new operator
                            }
                        }
                    }



                }//for(int i = 0; i < a.length; i++){

                while (head != null){

                    postfix = postfix + " " + head.data;

                    head = pop(head);

                }


                //resultTextView.setText(postfix);
                System.out.println(postfix);

                Node top;

                top = convert(postfix);                   // convert postfix to infix

                //error handle (add now)
                if (inputError == true){
                    resultTextView.setText("Invalid Input");
                    return;
                }

                double sol = evaluate(top.leaf);

                if (inputError == true){
                    resultTextView.setText("Invalid Input");
                    return;
                }

                resultTextView.setText(sol+"");
                System.out.println(sol);
            }
        });
    }

    static Node convert (String postfix){       // convert the postfix expression into infix expression

        Node top = null;
        Node curr = null;

        String str;

        Scanner input = new Scanner(postfix);

        while (input.hasNext()){
            str = input.next();

            if (str.compareTo("+") == 0 || str.compareTo("-") == 0 || str.compareTo("*") == 0 || str.compareTo("/") == 0 ){

                //System.out.println(top.leaf.data);
                if(top == null){
                    inputError = true;
                    return top;
                }
                TN T1 = top.leaf;
                top = pop(top);

                if(top == null){
                    inputError = true;
                    return top;
                }
                TN T2 = top.leaf;
                top = pop(top);

                TN leaf = new TN (str);
                leaf.left = T2;
                leaf.right = T1;

                top = push (top, leaf);
            }
            else{                            // if number
                TN leaf = new TN (str);
                top = push (top, leaf);
                //System.out.println(top.leaf.data);
            }

        }

        return top;
    }

    static Node push (Node top, TN leaf){

        Node nn = new Node(leaf);
        nn.next = top;
        top = nn;

        return top;
    }


    static Node pop (Node top){

        if (top != null){
            top = top.next;
        }

        return top;
    }


    static double evaluate(TN leaf){
        String str = leaf.data;
        double c = 0;

        if(str.compareTo("+") == 0 || str.compareTo("-") == 0 || str.compareTo("*") == 0 || str.compareTo("/") == 0 ){
            double a = 0;
            double b = 0;

            if (leaf.left != null){
                a = evaluate(leaf.left);
            }
            if (leaf.right != null){
                b = evaluate(leaf.right);
            }

            switch (str) {

                case "+":
                    c = a + b;
                    break;


                case "-":
                    c = a - b;
                    break;


                case "*":
                    c = a * b;
                    break;


                case "/":
                    c = a / b;
                    break;

            }//switch

        }//if

        else{
            try {
                System.out.println("str = " + str);
                c = Double.parseDouble(str);
            }catch (Exception e) {
                inputError = true;
                return 0;
            }
        }


        return c;
    }


    static int pres(char data){
        int val = 0;

        switch (data) {
            case '(':
                val = 0;
                break;
            case '+':
            case '-':
                val = 1;
                break;
            case '/':
            case '*':
                val = 2;
                break;
        }

        return val;
    }


    static QNode push (QNode top, char data){

        QNode nn = new QNode(data);
        nn.next = top;
        top = nn;

        return top;
    }


    static QNode pop (QNode top){

        if (top != null){

            top = top.next;
        }

        return top;
    }



}


