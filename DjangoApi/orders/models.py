from django.db import models

# Create your models here. #max_digits 최대길이, decimal_places 소수점 자리수
class Order(models.Model):
    order_id = models.CharField(max_length=100, blank=False, default='')
    member_id = models.CharField(max_length=100, blank=False, default='')
    order_name = models.CharField(max_length=200, blank=False, default='')
    order_price = models.DecimalField(max_digits=10, decimal_places=0, blank=False, default=0)
    
