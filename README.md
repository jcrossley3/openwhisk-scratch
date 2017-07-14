Just some dumb sample apps

An example of hitting an action via HTTP:

    wsk action invoke -d hi -p name Jimi -r

    curl -X POST -H "Content-Type: application/json" -H "Authorization: Basic Nzg5YzQ2YjEtNzFmNi00ZWQ1LThjNTQtODE2YWE0ZjhjNTAyOmFiY3pPM3haQ0xyTU42djJCS0sxZFhZRnBYbFBrY2NPRnFtMTJDZEFzTWdSVTRWck5aOWx5R1ZDR3VNREdJd1A=" -d '{"name":"Jimi"}' "http://192.168.99.100:30886/api/v1/namespaces/_/actions/hi?blocking=true&result=true"

    ab -n100 -c10 -p /dev/null -T "application/json" -H "Authorization: Basic MjNiYzQ2YjEtNzFmNi00ZWQ1LThjNTQtODE2YWE0ZjhjNTAyOjEyM3pPM3haQ0xyTU42djJCS0sxZFhZRnBYbFBrY2NPRnFtMTJDZEFzTWdSVTRWck5aOWx5R1ZDR3VNREdJd1A=" "https://192.168.33.13/api/v1/namespaces/_/actions/hi?blocking=true&result=true"

