function num(value)
{
    document.getElementsByClassName("display")[0].value+=value;
}
function calculate() 
{
    var p=document.getElementsByClassName("display")[0].value;
    var q=eval(p);
    document.getElementsByClassName("result")[0].value=q;
}  
function clean()
{
    document.getElementsByClassName("display")[0].value=" ";
    document.getElementsByClassName("result")[0].value=" ";
    
}  
function BACKSPACE()
{
    var s=document.getElementsByClassName("display")[0].value;
    var x=s.toString().slice(0,-1);
    document.getElementsByClassName("display")[0].value=x;
}   