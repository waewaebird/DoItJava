package chap03;
class A implements Comparable<A>{
    public int compareTo(A c){
        return -1;
    }

    public boolean equals(Object c) {
        return false;
    }
}
