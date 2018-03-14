function main(params) {
  console.log("In main, to stdout");
  var date = new Date();
  var now = (date.getHours() + ":" +
             date.getMinutes() + ":" +
             date.getSeconds());
  console.log("Invoked at: " + now);
  console.error("Out main, to stderr");
  return { message: "Invoked at: " + now };
}
