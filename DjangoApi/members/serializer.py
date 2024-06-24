from rest_framework import serializers
from members.models import Member

class MemberSerializer(serializers.ModelSerializer):
    class Meta:
        model = Member
        fields = (
            'id', #기본 고유값
            'member_id',
            'member_pw',
            'member_nick'
        )