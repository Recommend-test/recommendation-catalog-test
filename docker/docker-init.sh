docker-compose rm -f
docker-compoes down
docker-compose up -d
sleep 1
docker exec mongo bash -c "mongo -u root -p example admin /setup/mongodb-setup.sh"