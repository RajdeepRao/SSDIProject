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

# Setup MySQL
#export PATH=/usr/local/mysql/bin:$PATH

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

# Install and setup Django
pip3.5 install django

# Create Django Project
#django-admin startproject TaRa

# Setup Django Project
#cd TaRa
#export PYTHONPATH=/Users/chetan/anaconda/lib/python3.5
#python3.5 manage.py migrate

# Start dev server
#python3.5 manage.py runserver

