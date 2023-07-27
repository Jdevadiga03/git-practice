interface Calci{
int getsum(int n1,int n2);
}

class CalciImpl implements Calci{
int getsum(int n1, int n2)
{
return n1+n2;
}
}