from rest_framework import serializers
from orders.models import Order

class OrderSerializer(serializers.ModelSerializer):
    class Meta:
        model = Order
        fields = (
            'id', #기본 고유값
            'order_id',
            'member_id',
            'order_name',
            'order_price'
        )