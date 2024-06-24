from django.db import models

# Create your models here. #max_digits 최대길이, decimal_places 소수점 자리수
class Board(models.Model):
    board_id = models.CharField(max_length=100, blank=False, default='')
    board_title = models.CharField(max_length=200, blank=False, default='')
    board_content = models.CharField(max_length=500, blank=False, default='')

