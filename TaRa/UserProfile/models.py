from django.db import models


class User(models.Model):
    firstName = models.CharField(max_length=20)
    lastName = models.CharField(max_length=20)
    birthDate = models.DateTimeField('date published')

