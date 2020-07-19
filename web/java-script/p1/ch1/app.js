function foo()
{
    console.log('hi');
}

foo();

var x=foo;

x.call();

x();

x = () =>{
    console.log('bye');
}

x.call();

x.apply();

var obj={
    "key":foo
}

obj.key.call();

