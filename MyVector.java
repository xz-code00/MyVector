class MyVector{

    private int nElementi;
    private Object vettore[];

    public MyVector(){
        nElementi = 0;
        vettore = new Object[10];
    }



    public void add(Object x){

        if (nElementi < vettore.length) {
            vettore[nElementi] = x;
            ++nElementi;
        }
        else
            System.out.println("Il vettore è pieno");

    }

    public String toString(){

        String stringa = "";

        for (int i = 0; i < nElementi; ++i)
            stringa += vettore[i].toString() + '\n';

        return stringa;

    }

    public boolean contains(Object x){

        boolean verifica = false;

        for(int i = 0; i < nElementi && verifica == false; ++i){
            if(vettore[i].equals(x))
                verifica = true;
        }

        return verifica;

    }

    public void remove(int index){
        vettore[index] = null;

        for (int i = index; i < nElementi - 1;++i){
            vettore[i] = vettore[i + 1];
        }
       vettore[nElementi - 1] = null;
        --nElementi;
    }

    public void clear(){
        for (int i = 0; i < nElementi; ++i)
            vettore[i] = null;
        nElementi = 0;
    }

    public int size(){
        return nElementi;
    }
}
