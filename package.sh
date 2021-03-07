set -x

docker login
docker build -t sushranthhebbar/calculator:latest .
docker push sushranthhebbar/calculator:latest

set +x