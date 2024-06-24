from rest_framework import serializers
from boards.models import Board

class BoardSerializer(serializers.ModelSerializer):
    class Meta:
        model = Board
        fields = (
            'id', #기본 고유값
            'board_id',
            'board_title',
            'board_content'
        )