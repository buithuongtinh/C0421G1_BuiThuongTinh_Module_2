package _11_stack_va_queue.bai_tap;


//stack// Ngăn xếp (Stack) là vào sau ra trước (last in first out)
public class Stack<N> {
    int size;
    int top;
    char[] a;

    //  function kiểm tra ngăn xếp có trống ko
    boolean isEmpty()
    {
        return (top < 0);
    }

    Stack(int n)
    {
        top = -1;
        size = n;
        a = new char[size];
    }
    //đẩy phần tử vào trong ngăn xếp
    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Khong the chen them du lieu vi Stack da day.\\n");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
    //function để pop phần tử trong ngăn xếp
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Khong the lay du lieu, Stack la trong.\n");
            return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }

 //function đảo ngược
    public static void reverse(StringBuffer str)
    {
        //tạo 1 ngăn xếp
        // bằng chiều dài của chuổi
        int n = str.length();
        Stack obj = new Stack(n);

        // đẩy tất cả các kí tự của chuổi vào ngăn xếp
        int i;
        for (i = 0; i < n; i++)
            obj.push(str.charAt(i));

        // lấy tất cả các kí tự ra
        // và đưa vào lại ngăn xếp
        for (i = 0; i < n; i++)
        {
            char ch = obj.pop();
            str.setCharAt(i,ch);
        }
    }
    public static void main(String args[])
    {
        //tạo một chuỗi
        StringBuffer s= new StringBuffer("Chuỗi đã đảo ngược là");

        //gọi
        reverse(s);

        System.out.println("Chuỗi đã đảo ngược là: " + s);
    }
}