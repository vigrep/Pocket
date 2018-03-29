#编码思维&产品思维

1. 不要让用户接触不可控的区域。通过代码无法确保一定能控制住的区域，不能暴露给用户

2.
发现病变之处，应该采取终止处理，不应该将病变之处转移到别处。
eg：
function f(int n)
{
   if (n == 0)
     n = -1;
   if(n >0 )
    ...
    ...
}
	