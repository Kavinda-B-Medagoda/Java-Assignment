package org.example;

class Hobbits1f {
    String name;

    public static void main(String[] args) {
        Hobbits1f[] h = new Hobbits1f[3];
        int z = 0;

        while (z<3){ // here also we need to change the 4 as 3. because it causes to an array out of bound error.
            h[z] = new Hobbits1f();
            h[z].name = "bilbo";
            if (z==1){
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good hobbit name");
            z = z + 1; //if this code line still write at the start of while loop it increase the array index in the start of the iteration. it will cause to miss an array element.
        }
    }
}
