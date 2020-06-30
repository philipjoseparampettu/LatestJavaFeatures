/*
1. https://developers.google.com/web/tools/chrome-devtools/memory-problems
2. https://www.lambdatest.com/blog/eradicating-memory-leaks-in-javascript/
3. https://auth0.com/blog/four-types-of-leaks-in-your-javascript-code-and-how-to-get-rid-of-them/

*/
var x = [];

function grow() {

  for (var i = 0; i < 10000; i++) {
    document.body.appendChild(document.createElement('div'));
  }
  x.push(new Array(1000000).join('x'));
  //console.info('grown');
}

document.getElementById('grow').addEventListener('click', grow);


var detachedTree;

function create() {
  var ul = document.createElement('ul');
  for (var i = 0; i < 10; i++) {
    var li = document.createElement('li');
    ul.appendChild(li);
  }
  detachedTree = ul;
}

document.getElementById('create').addEventListener('click', create);
