//const todoinput=document.querySelectorAll(".head1");
const todobutton=document.querySelectorAll(".additem");
const todolist=document.querySelectorAll(".listall");
//var noofactivities=document.querySelectorAll("activities");
// todobutton.addEventlistener('click',addtodo);
function addtodo(){
    let a=todoinput1.value;
    const v=document.getElementById('activities');
    const tododiv = document.createElement("li");
    tododiv.textContent=a;
    v.appendChild(tododiv);
    todoinput1.value=" ";
    //var img = document.createElement('img');
    /*img.src = "./checkmark.png";
    tododiv.appendChild(img);*/
    v.appendChild(tododiv);//
    var noofactivities=document.querySelector(".checked");
    document.getElementById("count").innerHTML=noofactivities.childElementCount;
   // total++;
    //count.innerHTML=total;
    //event.preventDefault();
    
   // tododiv.classList.add("todo");
  
    //const newtodo=document.createElement('li');
    
    //newtodo.classList.add("todoitem");
    
    //todolist.appendChild(tododiv);
    
}
var noofactivities=document.querySelector("activities");
var list = document.querySelector('ul');
list.addEventListener('click', function(ev) {
  if (ev.target.tagName === 'LI') {
    ev.target.classList.toggle('checked');
  }
}, false);



























/*var routines = [{action: 'excercising', stat:'done'},
{action:'Going to bank', stat:'pending'},
{action:'breakfast', stat:'pending'},
{action:'attending to a party', stat:'pending'},];

count();
var l = routines.length;
function update(){
    var t = document.getElementsByClassName('head1')[0].value;
    if (t.trim() === '') {
        alert('please enter the title');
    } else {
        var t1 = { action:t, stat: 'pending' };
        routines.push(t1);
    }
    return count();
}
function count() {
    var l = routines.length;
    var s = document.getElementsByClassName('headerr')[0];
    var heading = s.getElementsByTagName('h4')[0];
    heading.innerHTML = "List of todo tasks : " + l;
    return Additems();
}
function Additems() {
    var listitems = document.getElementsByTagName('ul')[0];
    var ul = document.createElement('ul');
    listitems.replaceWith(ul);
    routines.forEach(ele =>{
        var li = document.createElement('li');
        var p = document.createElement('p');
        var img = document.createElement('img');
        img.src = "./checkmark.png";
        if (ele.stat === 'done') {
            li.classList.toggle('checked');
        }
        p.innerHTML = ele.task;
        li.appendChild(img);
        li.appendChild(p);
        ul.appendChild(li)
    });

    
    ul.addEventListener('click', function (ev) {
        if (ev.target.tagName === 'LI') {
            var li = ev.target.closest('li');
            var n = Array.from(li.closest('ul').children);
            var index = n.indexOf(ev.target.closest('li'));
            if (routines[index].stat === 'pending') {
                routines[index].stat = 'done';
            } else {
                routines[index].stat = 'pending';
            }
        }
        Additems();
    }, false);
    return false;
};*/