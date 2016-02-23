package dcll.aaou;

import java.util.EmptyStackException;

/**
 * Created by AAnass on 19/02/2016.
 */

public class MySimpleStack implements SimpleStack {
    Item []item;
    int i;
    MySimpleStack(){
        i = 0;
    }

    MySimpleStack(int taille){
        item = new Item[taille];
        i = 0;
    }

    @Override
    public boolean isEmpty() {
        if(item == null) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getSize() {
        return item.length;
    }

    @Override
    public void push(Item item) {
        this.item[i] = item;
        i++;
    }

    @Override
    public Item peek() throws EmptyStackException {
        return item[0];
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item returnItem = item[0];
        for(int k = 0; k < i; k++){
            item[k] = item[k+1];
        }
        return returnItem;
    }
}
