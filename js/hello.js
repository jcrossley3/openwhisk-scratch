function main(params) {
  var name = params.name || 'stranger';
  var greeting = 'Hello ' + name + '!';
  console.log(greeting);
  console.error("Javascript to stderr");
  return {greeting:  greeting};
}
