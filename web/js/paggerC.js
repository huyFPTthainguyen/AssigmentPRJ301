/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function pagger(id,pageindex,totalpage)
{
    container = document.getElementById(id);
    var result = '';
    result += 'Page:<input id="pageindex_input" type="text" value="'+pageindex+'"/> over '+totalpage;
    container.innerHTML = result;
    
    
    var input = document.getElementById("pageindex_input");

    
    input.addEventListener("keyup", function(event) {
      
      if (event.keyCode === 13) {
            window.location.href = 'ManagerC?page='+input.value; 
      }
    });
}
