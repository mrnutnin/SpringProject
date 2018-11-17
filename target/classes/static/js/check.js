$(function() {
    $("#txtConfirmPassword").keyup(function() {
        var password = $("#txtNewPassword").val();
        $("#divCheckPasswordMatch").html(password == $(this).val() ? "" : "Passwords do not match!");
    });

});



function validateForm()
  {  
  var x=document.forms["login"]["username"].value;
  var y=document.getElementById('actual').value;            
  
      if (y=="taken")
      {
             alert("Name already exist in database");
          return false;
      }else
      {
              alert("No name exist");
      }
          
          
   }

function loadXMLDoc()
{
var xmlhttp;
var k=document.getElementById("username").value;
var urls="checkusername.jsp?ver="+k;

if (window.XMLHttpRequest)
{
xmlhttp=new XMLHttpRequest();
}
else
{
xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
}
xmlhttp.onreadystatechange=function()
{
if (xmlhttp.readyState==4)
{
document.getElementById("err").innerHTML=xmlhttp.responseText;
}
}
xmlhttp.open("GET",urls,true);
xmlhttp.send();
}
