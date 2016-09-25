# Create setup folder
mkdir setup
cd setup

# Install Apache, MySQL, PHP
# Refer: https://www.mamp.info/en/

# Enable PHP for Apache
# Refer: http://jason.pureconcepts.net/2015/10/install-apache-php-mysql-mac-os-x-el-capitan/
#cd /etc/apache2/
#sudo cp httpd.conf httpd.conf.bak
# Modify httpd.conf
#vi httpd.conf
# Uncomment "LoadModule php5_module libexec/apache2/libphp5.so"
#echo '<?php phpinfo();' > /Library/WebServer/Documents/phpinfo.php

# Install MySQL server
# Refer: http://dev.mysql.com/downloads/mysql/

# Setup MySQL server and change password
# Refer: https://coolestguidesontheplanet.com/get-apache-mysql-php-and-phpmyadmin-working-on-osx-10-11-el-capitan/
#export PATH=/usr/local/mysql/bin:$PATH
#/usr/local/mysql/bin/mysqladmin -u root -p'temppassword' password 'newpassword'

# Start/Stop MySQL server
#sudo /usr/local/mysql/support-files/mysql.server start
#sudo /usr/local/mysql/support-files/mysql.server stop
#sudo /usr/local/mysql/support-files/mysql.server restart

# Connect PHP and MySQL
#cd /var 
#sudo mkdir mysql
#cd mysql
#sudo ln -s /tmp/mysql.sock mysql.sock

# Install PHPMyAdmin
#wget https://files.phpmyadmin.net/phpMyAdmin/4.6.4/phpMyAdmin-4.6.4-all-languages.zip
#sudo cp phpMyAdmin-4.6.4-all-languages.zip /Library/WebServer/Documents/
#cd /Library/WebServer/Documents/
#tar -xvf ~/Downloads/phpMyAdmin-3.5.2.2-english.tar.gz
#sudo rm phpMyAdmin-4.6.4-all-languages.zip
#sudo mv phpMyAdmin-4.6.4-all-languages/ phpmyadmin
#cd phpmyadmin
#sudo mv config.sample.inc.php config.inc.php
#sudo chmod 0755 config.inc.php

# Start Apache Web Server
#sudo apachectl start

# Setup mod_wsgi (require to deploy Django in poduction)
# Refer: https://modwsgi.readthedocs.io/en/develop/user-guides/quick-installation-guide.html
#wget https://github.com/GrahamDumpleton/mod_wsgi/archive/4.5.7.tar.gz
#tar xvzf 4.5.7.tar.gz
#cd mod_wsgi-4.5.7
#./configure
#./configure --with-python=/Users/chetan/anaconda/bin/python --with-apxs=/usr/sbin/apxs
#make
#sudo make install LIBEXECDIR=/usr/local/httpd/modules
#LoadModule wsgi_module /usr/local/httpd/modules/mod_wsgi.so
#make clean

# Restart Apache Web Server
#sudo apachectl restart

# Install Python3.5
sudo pip install python3.5

# Install and setup Django
pip3.5 install django

# Install python mysqlclient
# Refer: https://pypi.python.org/pypi/mysqlclient
# Refer: http://stackoverflow.com/questions/27748556/python3-4-cant-install-mysql-python 
#export PATH=/usr/local/mysql/bin:$PATH
#sudo pip install mysqlclient

# Create Django Project
#django-admin startproject TaRa

# Setup Django Project
#cd TaRa
#export PYTHONPATH=/Users/chetan/anaconda/lib/python3.5

# Create database for Project
#mysql -v -u root -p
#create DATABASE TaRa;
#use TaRa;
#CREATE USER 'admin'@'localhost' IDENTIFIED BY 'admin';
#GRANT ALL PRIVILEGES ON *.* TO 'admin'@'localhost';
#FLUSH PRIVILEGES;

# Sync database schema
#python3.5 ../manage.py migrate

# Start dev server
#python3.5 manage.py runserver

# To create a new Django Application
#cd TaRa
#python3.5 ../manage.py startapp UserProfile

# Checkpoint for database schema
#python3.5 ../manage.py makemigrations UserProfile

# Get SQL representation for databse schema
python3.5 ../manage.py sqlmigrate UserProfile 0001

# Create superuser
python3.5 ../manage.py createsuperuser
