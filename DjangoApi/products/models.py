from django.db import models

# Create your models here. #max_digits 최대길이, decimal_places 소수점 자리수
class Product(models.Model):
    product_name = models.CharField(max_length=30, blank=False, default='')
    price = models.DecimalField(max_digits=20, decimal_places=1, blank=False, default=0) 
    

