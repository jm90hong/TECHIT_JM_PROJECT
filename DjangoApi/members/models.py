from django.db import models

# Create your models here. #max_digits 최대길이, decimal_places 소수점 자리수
class Member(models.Model):
    member_id = models.CharField(max_length=100, blank=False, default='')
    member_pw = models.CharField(max_length=100, blank=False, default='')
    member_nick = models.CharField(max_length=30, blank=False, default='')

