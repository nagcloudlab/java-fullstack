
// dev-1

function hello(){
    console.log("Hello..");
    // console.log("🙋‍♂️");
}

function hi(){
    console.log("Hi");
    // console.log("🙋‍♂️");
}

//---------------------------------

// design issues

// => code tangling / tight-coupling
// -> code scattering / duplication



// solution :  using HOF

//---------------------------------


function withHandRaiseEmoji(f){
    return function(){
        f();
        console.log("🙋‍♂️");
    }
}


function withSunFlowerEmoji(f){
    return function(){
        f();
        console.log("🌻");
    }
}

//---------------------------------


// hello();

const helloWithHandRaiseEmoji=withHandRaiseEmoji(hello)
const newF=withSunFlowerEmoji(helloWithHandRaiseEmoji)

newF()