const hl = Hellow();
console.log(hl);
function Hellow (){
     return "Hello world"
}




var createHello = function(){
   return function Hellow (){
     return "Hello world";
   }
}

const h2 = createHello();
console.log(h2());